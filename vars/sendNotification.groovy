def call (Map args = [:]) {
  result = args.get("result", currentBuild.result)
  mailTo = args.get("mailTo", env.MAIL_TO)

  if (result == "SUCCESS") {
    mail to: mailTo,
    subject: "Build success for job: ${currentBuild.fullDisplayName}",
    body: "The build finished with success, take a look at ${env.BUILD_URL}"
  } else { // UNSTABLE or FAILURE
    mail to: mailTo,
    subject: "Build fail for job: ${currentBuild.fullDisplayName}",
    body: "Someone broke the build, take a look at ${env.BUILD_URL}"
  }
}
