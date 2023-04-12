// var 1
int product(int x, int y) {
    return x * y
}

println product(10, 2)

// var 2
def product2(x, y) {
    x * y
}
def res = product2 10,3
println res

// var 3
def product3(x = 10, y) {
    x * y
}
res = product3(4)
println res



// we can pass parameters
void display(Map params) {
    params.each { println it.value }
}
display(name:'Iphone', price:1000)

// var 2
void display2(Map params) {
    println params.name
    println params.price
}
display2 name:'Xiaomi', price:2000

