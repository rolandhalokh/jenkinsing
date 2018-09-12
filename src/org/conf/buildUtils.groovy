package org.demo

@NonCPS
String generatePodname(String source) {
    // Convert percent-encoded characters to regular UTF-8 characters
    source = URLDecoder.decode(source, "UTF-8")
    String randomString = (
        (1..4).inject("") {
            a, b -> a += ('a'..'z')[
                new Random().nextFloat() * 26 as int
            ]
        }
    )
    String jobname = "minion-" + randomString + "-" + source.replaceAll("[^-A-Za-z0-9_]", "-")
    jobname = jobname.take(63).replaceAll("-+\$", "")
    return jobname
}
