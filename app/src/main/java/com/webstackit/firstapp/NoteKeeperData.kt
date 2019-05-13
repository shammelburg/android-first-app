package com.webstackit.firstapp

data class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo (var course: CourseInfo, var title: String, var text: String){
    override fun toString(): String {
        return course.title
    }
}



