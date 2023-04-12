// like lambda in java

c = {
    println("Closures are super")
}
c.call()

c = { n ->
    println(n%2 == 0 ? "even" : "odd")
}
c.call(10)

// times function
3.times { n -> println n}

// it keyword
3.times { println it}


