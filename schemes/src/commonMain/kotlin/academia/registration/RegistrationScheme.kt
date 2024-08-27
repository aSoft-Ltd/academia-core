package academia.registration

interface RegistrationScheme {
    val email: UntrustedRegistrationMethodScheme
    val phone: UntrustedRegistrationMethodScheme
}