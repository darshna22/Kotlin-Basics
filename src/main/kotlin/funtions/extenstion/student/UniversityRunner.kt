package funtions.extenstion.student

import funtions.extenstion.student.repo.UniversityRepositoryImpl
import funtions.extenstion.student.service.RepositoryService

fun main() {
    val repositoryService = RepositoryService(UniversityRepositoryImpl())
    println(repositoryService.getPaidCoursesWithTheNumbersOfSubscribedStudents(4))
}