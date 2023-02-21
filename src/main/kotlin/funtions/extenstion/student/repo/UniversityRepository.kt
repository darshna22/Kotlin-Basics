package funtions.extenstion.student.repo

interface UniversityRepository<T> {
    // will return list of T type
    fun get():Iterable<T>
}