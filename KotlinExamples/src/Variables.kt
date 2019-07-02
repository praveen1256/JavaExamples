fun main(args: Array<String>){
	println("Variables")
	
	var myString = "My String"
	var myNumber = 34

	var myString2 : String
	
	myString2 = "My String2"
	myString2 = "My String2 Changed"
	
	val myString3 = "My String3"
	
	println(myString)
	println(myNumber)
	println(myString2)
	
	
	println("My Id "+myNumber)
	myIdPrint(myNumber)
	
	var school = School()
	school.schoolName = "HPS"
	school.myIdPrint(myNumber)
	school.mySchoolName()
	
	println("School Name "+school.schoolName)
	println("String Interpolation ${school.schoolName}")
	println("String Interpolation $school.schoolName")
	println("My Number $myNumber")
	
}

class School{
	
	var schoolName : String = ""
	
fun myIdPrint(myNumber : Int){
	println("Class My Id "+myNumber)
}
	
	fun mySchoolName(){
		println(schoolName)
	}
	
}

fun myIdPrint(myNumber : Int){
	println("Fun My Id "+myNumber)
}
