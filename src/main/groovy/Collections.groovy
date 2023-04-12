
l = [1,2,3]
println l
println l.class

LinkedList l = [1,2,3]
println l
println l.class

// add element to list like l.add(4)
l << 4
println l

// add elements to list like l.addAll([5,6,7])
l = l + [5, 6, 7]
println l

// remove elements from list like l.removeAll([3,4])
l = l - [3,4]
println l

// ітерація по колекшину
l.each { println it }

// reverse order
l.reverseEach { println it}

// якась діч
//l.eachPermutation { println it }



// Set
s = ['java', 'js', 'js', 'python'] as Set
println s
println s.class

// Map
m = [courseName:'Gradle', rating:5] as Map
println m

m.each { k,v ->
    println k
    println v
}

// map.get(key)
println m.courseName
println m['courseName']
println m.get('courseName')

// add elements
m.review = "Its Awesome"
println m.get('review')

m['go'] = "Haha"
println m.get('go')
