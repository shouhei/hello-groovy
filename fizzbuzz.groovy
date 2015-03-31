for(a in 0..99){
  if(0 == (a % 15)){
    println "FizzBuzz"
  }else if(0 == (a % 3)){
    println "Fizz"
  }else if(0 == (a % 5)){
    println "Buzz"
  }else{
    println a
  }
}
