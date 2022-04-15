import javax.management.MBeanRegistration

fun main(){
    var names2 = names(listOf("Ashly", "Loise", "Jay", "Cassandra", "Jake", "Viviane", "Carson", "Daphine", "Theo", "Espe"))
    peoplesHeights()
    var a = People("Tophil",40,1.83,63)
    var b = People("Benadine", 54, 1.68, 74)
    var c = People("Antonina", 60,1.67,70)
    var d = People("Pamphil",57,1.90,75)
    var person  = listOf<People>(a,b,c,d)
    var pple = person.sortedByDescending{ person ->person.age }
    println(pple)

    morePple(listOf())

    var person1 = People("Stephen",25,1.93,70)
    var person2 = People("Titus",27,1.83,75)
    var addpeople = mutableListOf(person1,person2)

    println(pple)

    var x = Vehicles("KYF020F",60)
    var y = Vehicles("KBM230G",50)
    var z = Vehicles("KCF343P",70)
    var p = Vehicles("KFD343V",75)
    var allVehicles= listOf(x,y,z,p)
    println(vehicleList(allVehicles))

}

//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc(2 points)
fun names(name:List<String>):List<String>{
    name.forEachIndexed { index, s ->
        if(index%2==0){
            println(s)
        }
    }
    return name
}

//2.Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height(2 points)
fun peoplesHeights() {
    var pplesheights = mutableListOf(1.7, 1.68, 1.50,1.9, 1.85, 1.73, 1.80)
    println(pplesheights.average())
    println(pplesheights.sum())
}
//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)

class People(var name:String, var age:Int, var height:Double, var weight:Int)

//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun morePple(twopple:List<People>):List<Any>{
    return listOf()

}
//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var avg=0
    vehicle.forEach { new->new.mileage
        avg+=new.mileage

    }
    var totalAvg=avg/vehicle.count()
    return totalAvg
}