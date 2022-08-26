def call(String content, int maxLength) {
  return content.substring(0, Math.min(maxLength, content.length())).trim()
}
