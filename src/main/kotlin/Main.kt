interface Desctiptor<T> {
    fun getDescription(description: T)
}

class BookDescriptor : Desctiptor<Book> {
    override fun getDescription(description: Book) {
        println(description.data + " " + description.author)
    }
}

class NewspaperDescriptor : Desctiptor<Newspaper> {
    override fun getDescription(description: Newspaper) {
        println(description.data + " " + description.number)
    }
}

class VideoDescriptor : Desctiptor<Video> {
    override fun getDescription(description: Video) {
        println(description.data + " " + description.duration)
    }

}

fun main(args: Array<String>) {
    val bookDescriptor = BookDescriptor()
    val book = Book("book_1", "author_1")
    bookDescriptor.getDescription(book)

    val newspaperDescriptor = NewspaperDescriptor()
    val newspaper = Newspaper("newspaper_1", 11)
    newspaperDescriptor.getDescription(newspaper)

    val videoDescriptor = VideoDescriptor()
    val video = Video("video_1", 25)
    videoDescriptor.getDescription(video)

}