package academia.registration.tooling

fun extractCodeFromEmail(body: String): String {
    return body.split(" ").last()
}