fun main(args: Array<String>){
	println("Ranges")
	
	// This Contains the number 1,2,3,4,5
	val range1 = 1..5
	
	// This range contains the number 5,4,3,2,1
	val range2 = 5 downTo 1
	
	// This range contains the number 5,3,1
	val range3 = 5 downTo 1 step 2
	
	// This range contains the values from a,b,c.....z
	val range4 = 'a'..'z'
	
	// To check b is present in range4 are not
	var isBPresent = 'b' in range4
	
	// This range contains the number 5,4,3,2,1
	var countDown = 5.downTo(1)
	
	// This Contains the number 1,2,3,4,5
	var countUp = 1.rangeTo(5)
	
}