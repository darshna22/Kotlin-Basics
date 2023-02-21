package funtions.extenstion.student.service

import funtions.extenstion.student.model.Course
import funtions.extenstion.student.model.Student
import funtions.extenstion.student.repo.UniversityRepository

class RepositoryService(private val universityRepository: UniversityRepository<Student>) {

    //method which will return list of students from University repo
    private fun getStudentList(): Iterable<Student> = universityRepository.get()

    private fun getStudentWithPaidCourses(): Map<Student, List<Course>> {
        val studentCourseMap = mutableMapOf<Student, List<Course>>()
        val studentList = getStudentList();
        studentList.map { student: Student ->
            val paidCourseList = student.subscribedCourses.filter { course: Course -> course.isPaid }
            studentCourseMap[student] = paidCourseList
        }
        return studentCourseMap
    }

    private fun getCourseWithPaidStudentCount(): Map<Course, Int> {
        val studentCourseMap = getStudentWithPaidCourses()
        val courseStudentMap = mutableMapOf<Course, Int>()
        studentCourseMap.map { (student, courses) ->
            courses.map { course ->
                if (courseStudentMap.containsKey(course)) {
                    courseStudentMap[course] = courseStudentMap[course]!!.plus(1);
                } else {
                    courseStudentMap[course] = 1
                }
            }
        }
        return courseStudentMap
    }

    private fun getCourseWithMaxPaidStudentCount(): Map<Course, Int> {
        val courseStudentMap = getCourseWithPaidStudentCount()
        val list = courseStudentMap.toList()
        val sortedDescendingList = list.sortedByDescending { it.second }
        return sortedDescendingList.toMap()
    }

    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
        val map = getCourseWithMaxPaidStudentCount()
        return if (map.size >= coursesCount) map.toList().take(coursesCount).toMap() else map
    }
}