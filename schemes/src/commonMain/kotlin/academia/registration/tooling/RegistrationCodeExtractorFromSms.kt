package academia.registration.tooling

fun extractCodeFromSms(body: String): String {
    return body.split(" ").last()
}