class Patient {
    static hospital = "Best Hospital"
    def firstName, lastName, age

    void setMyAge(age) {
        this.age = age
    }

    static void display() {
        println(hospital)
    }
}

p = new Patient(firstName:'Pavlo', lastName:'Kho', age:30)
println p.firstName+" "+p.lastName+" "+p.age
p.setMyAge(29)
println p.firstName+" "+p.lastName+" "+p.age

Patient.display()

