dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.0")
    implementation(project(":common"))
    implementation(project(":core:employee-registry"))
    implementation(project(":storage:in-memory-storage"))
    implementation(project(":audit:in-memory-audit"))
}