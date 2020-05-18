.data
SV: .space 200
MAX_OF_SV: .word 10
Message : .asciiz "Danh sach sinh vien truot la \n"
Message1: .asciiz "so luong SV phai > 0"
Number_Of_SV: .asciiz "Nhap so luong sinh vien MAX = 10"
Name_Of_SV : .asciiz "Nhap ten SV: "
Check_Mark: .asciiz "diem >0 and diem <10"
Diem: .asciiz "Nhap diem <= 10"

.text

	
Main:
	lw $s1,MAX_OF_SV #max of sinh vien  ??c d? li?u word t? b? nh? ??a v�o thanh ghi s1
	#nhap n( NH?p s? l??ng sinh vi�n 
	li $v0,51# g?i h?p tho?i ( c?a s?) nh?p s? l??ng sinh vi�n 
	la $a0,Number_Of_SV #$a0 ti�u ??: Nh?p v�o s? l??ng sinh vi�n MAX=10
	syscall#$a0 s? sinh vi�n 
		
	slt $t0,$s1,$a0  # so s�nh $s1 < $a0 ? n?u ?�ng th� $t0=1
	bne $t0,$0,Main #n?u ($t0!=0) th� nh?y l?i l?nh main 
	slt $t0,$0,$a0# c�n n?u ($t0#0) sai hay $0<$a0 ?�ng th� th?c hi?n so s�nh ti?p $0<$a0??
	bne $t0,$0,Continue #n?u ($t0!=$0) t?c l� ($0<$a0) ?�ng th� nh?y l?nh Countinue
	li $v0,55# n?u 0<$a0 g?i h?p tho?i th�ng b�o 
	la $a0,	Message1# $a0 ti�u ?? :"so luong SV phai > 0"
	syscall# Nh?p l?i $a0 la s? l??ng sinh vi�n c?a l?p 
	j Main
Continue:
	#khoi tao gia tri c�c gi� tr?
	add $s0,$a0,$0 # $g�n s0 = n =a0= so luong sv
	la $s1,SV #??a ch? c? s? m?ng SV
	add $t1,$0,$s0  # i = n
	addi $s3,$s1,0  #s3=sv[0]
NhapMang:
	beq $t1,0,Done  #n?u t1==0 thi nh?y sang Done 
	li $v0,54 # g?i h?p tho?i nh?p t�n sinh vi�n  
	la $a0,Name_Of_SV# ti�u ?? Name_Of_SV
	la $a1,0($s3)# ch? ra v? tr� L?u t�n 
	la $a2,16# gi?i h?n ?? d�i l� 16 k� t? 
	syscall# nh?p t�n 

	addi $s3,$s3,16	
Mark:
	#nhap diem
	li $v0,51# g?i h?p tho?i
	la $a0,Diem# ti�u ?? : Diem
	syscall# Nh?p ?i?m 
	slti $t0,$a0,11# so s�nh a0<11 ?�ng th� t0=1
	beq $t0,$0,Mark# n?u t0==0 th� nh?y l?i l?nh Mark
	
	slt $t0,$0,$a0# c�n n?u kh�ng so s�nh 0<a0,n?u ?�ng t0=1
	bne $t0,$0,Continue1#n?u t0=0 th� nh?y sang l?nh Continue1
	li $v0,55 # n?u kh�ng th� g?i h?p tho?i th�ng b�o 
	la $a0,	Check_Mark# ti�u d� Check_mark
	syscall# nh?n ok
	j Mark #Nh?y l?i l?nh mark
Continue1:	
	sw $a0,0($s3)# c?t ??a ch? c? s? s3 v�o thanh ghi b? nh? a0
	addi $s3, $s3, 4# nh?y ??n ph?n t? m?ng ti?p theo 
	addi $t1,$t1,-1# kh?i t?o l?i gi� tr? t1=0
	
	j NhapMang# Nh?y v? l?nh nh?p m?ng 
Done:
	li $v0,4# g?i k?t qu? 
	la $a0,Message	# ti�u ?? "Danh sach sinh vien truot la \n"
	syscall
Print_name:
	addi $t3, $0,0 # i = 0 
	add $s4,$0,$s1 # ??a ch? sv[0]
	
for:	add $s5,$s4, $0 #s5=s4

	addi $t5,$s4,16 # sv[0]+16
	lw   $t6,0($t5) # n?p  sv[0].diem
	
	slti $t7,$t6,5# ?i?m check l� 5, so s�nh ?i?m nh?p v�o v?i 5, n?u b� h?n th� t7=1
	bne $t7,$0,print_char # n?u t7!=0 th� nh?y sang l?nh print_char
	j next# c�n n?u kh�ng th� nh?y sang l?nh next

print_char: #in ten
	lb $t2,0($s5) # load byte
	beq $t2,10, end_for # = \n. n?u t2==10 th� nh?y l?nh end_for
	addi $a0,$t2,0 # n?u kh�ng th� a0 = t2
	li $v0, 11 # print
	syscall
	addi $s5, $s5, 1 # j++
	j print_char 
end_for:
	li $v0,11# in char
	li $a0,10# tho�t ch??ng tr�nh 
	syscall
	
next:
	addi $t3, $t3,1 #sv[i++]
	beq $t3, $s0, end_print #i = n? th� nh?y sang end_print 
	mul $t4,$t3,20	#i*20
	add $s4,$s1,$t4 # address sv[i] 
	j for# Nh?y l?i l?nh for

end_print:
	

	
	
	
 	
	
	

	
	
	
	
