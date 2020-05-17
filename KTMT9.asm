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
	lw $s1,MAX_OF_SV #max of sinh vien  
	#nhap n
	li $v0,51
	la $a0,Number_Of_SV 
	syscall
	
	slt $t0,$s1,$a0  #$s0 < $s1 ?
	bne $t0,$0,Main
	slt $t0,$0,$a0
	bne $t0,$0,Continue
	li $v0,55
	la $a0,	Message1
	syscall
	j Main
Continue:
	#khoi tao gia tri
	add $s0,$a0,$0 # $s0 = n = so luong sv
	la $s1,SV #dia chi co so mang SV
	add $t1,$0,$s0  # i = n
	addi $s3,$s1,0  #sv[0]
NhapMang:
	beq $t1,0,Done  
	li $v0,54
	la $a0,Name_Of_SV
	la $a1,0($s3)
	la $a2,16
	syscall

	addi $s3,$s3,16	
Mark:
	#nhap diem
	li $v0,51
	la $a0,Diem
	syscall
	slti $t0,$a0,11
	beq $t0,$0,Mark
	
	slt $t0,$0,$a0
	bne $t0,$0,Continue1
	li $v0,55
	la $a0,	Check_Mark
	syscall
	j Mark
Continue1:	
	sw $a0,0($s3)
	addi $s3, $s3, 4
	addi $t1,$t1,-1
	
	j NhapMang
Done:
	li $v0,4
	la $a0,Message	
	syscall
Print_name:
	addi $t3, $0,0 # i = 0 
	add $s4,$0,$s1 # address sv[0]
	
for:	add $s5,$s4, $0 

	addi $t5,$s4,16 # sv[0]+16
	lw   $t6,0($t5) # read sv[0].diem
	
	slti $t7,$t6,5
	bne $t7,$0,print_char
	j next

print_char: #in ten
	lb $t2,0($s5) # load byte
	beq $t2,10, end_for # = \n
	addi $a0,$t2,0 # a0 = t2
	li $v0, 11 # print
	syscall
	addi $s5, $s5, 1 # j++
	j print_char 
end_for:
	li $v0,11
	li $a0,10
	syscall
	
next:
	addi $t3, $t3,1 #sv[i++]
	beq $t3, $s0, end_print #i = n?
	mul $t4,$t3,20	#i*20
	add $s4,$s1,$t4 # address sv[i] 
	j for

end_print:
	

	
	
	
 	
	
	

	
	
	
	
