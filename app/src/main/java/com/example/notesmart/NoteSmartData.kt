package com.example.notesmart

data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}
// Make te NoteInfo properties nullable (?) in order to create new instances when
//user creates a new note
data class NoteInfo( var course: CourseInfo? = null, var title: String? = null, var text: String? = null)