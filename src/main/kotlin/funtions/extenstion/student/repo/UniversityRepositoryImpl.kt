package funtions.extenstion.student.repo

import funtions.extenstion.student.model.Course
import funtions.extenstion.student.model.Student

class UniversityRepositoryImpl : UniversityRepository<Student> {

    override fun get(): Iterable<Student> {
        return getStudentList()
    }

    private fun getStudentList(): List<Student> {
        return listOf(
            Student(
                id = 1,
                name = "darshna",
                subscribedCourses = listOf(
                    Course(id = 1, name = "Math", isPaid = true),
                    Course(id = 2, name = "Hindi", isPaid = true),
                    Course(id = 3, name = "Art", isPaid = false),
                    Course(id = 4, name = "English", isPaid = true)
                )
            ),
            Student(
                id = 1,
                name = "mukesk",
                subscribedCourses = listOf(
                    Course(id = 1, name = "Math", isPaid = true),
                    Course(id = 4, name = "English", isPaid = true)
                )
            )
        )
    }
}