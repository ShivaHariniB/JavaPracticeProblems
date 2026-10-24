package AccentureQuestions;

public class StringSanitization {
    public static void main(String[] args) {
        String dirtyText = "  Hello   World! <script>alert('hack');</script> Welcome to Accenture...   ";
        System.out.println("Sanitized: [" + cleanInputText(dirtyText) + "]");
        // Output: [Hello World! alert(hack); Welcome to Accenture...]
    }

    public static String cleanInputText(String rawInput) {
        if (rawInput == null || rawInput.isEmpty()) {
            return "";
        }

        String noHtml = rawInput.replaceAll("<[^>]*>", "");
        String noSymbols = noHtml.replaceAll("[^a-zA-Z0-9\\s.,!?]", "");
        String finalCleaned = noSymbols.replaceAll("\\s+", "").trim();

        return finalCleaned;
    }
}
