
// var
def a = 10
println a
println a.class

float b = 10.2F
println a
println a.class

// String
s = 'hello'
println s

// GString
s = "hello $a"
println s

// text block
s = '''
This is
text block
'''
println s

// regex
emailPattern = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
print "test@gmail.com" ==~ emailPattern
