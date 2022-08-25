def call () {
  return trimOutput(executeCommand("git log --format=%B -n 1 HEAD | head -n 1", true), 180)
}
