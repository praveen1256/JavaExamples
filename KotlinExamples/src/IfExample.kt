fun main(args: Array<String>){
	
	println("If Expression Can Return Value")
	// Two var and val
	// val is constant i.e final
	
	var value = 10
	var value2 = "Name"
	var value3 = true
	value = 20
	
	var maxValue : Int
	var status : Boolean
	
	var name : String
	name = "Kumar"
	
	val a = 10
	val b = 20
	
	
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
