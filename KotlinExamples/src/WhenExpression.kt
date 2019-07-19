fun main(args: Array<String>){
	
	println("If Expression Can Return Value")
	
	val a = 10
	val b = 20
	
	var maxValue : Int
	
	if(a > b)
		maxValue = a
	else
		maxValue = b
	
	var maxVal : Int = if(a>b) a else b
	
	var maxVal2 : Int = if(a>b) {
						println("A is Greater")
							a
						} else {
						println("B is Greater")
							b
						}
	
	
	println(maxVal2)
	
}
