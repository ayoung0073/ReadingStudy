package kotlinInAction.etc.code.oop.dependency

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {

    val customerId: Int = p.id

    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1 = Patient("Kildong", 1234)
    val doc1 = Doctor("KimSabu", patient1) // 객체 따로 생성된다.
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}