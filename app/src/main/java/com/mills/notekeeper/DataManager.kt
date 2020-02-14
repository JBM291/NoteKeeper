package com.mills.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents","Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async","Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core","Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes(){
        var note = NoteInfo(CourseInfo("android_intents","Android Programming with Intents"),"title 1","note 1")
        notes.add(note)

        note = NoteInfo(CourseInfo("android_async","Android Async Programming and Services"),"title 2","note 2")
        notes.add(note)

        note = NoteInfo(CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang"),"title 3","note 3")
        notes.add(note)

        note = NoteInfo(CourseInfo("java_core","Java Fundamentals: The Core Platform"),"title 4","note 4")
        notes.add(note)
    }
}