package cs1302.api;

import java.util.Map;
import java.util.List;

/**
 * Represents the JSON response from the Dog CEO breeds list API.
 */
public class BreedListResponse {
    Map<String, List<String>> message;
    String status;
} // BreedListResponse
