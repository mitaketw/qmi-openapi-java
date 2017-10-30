package tw.com.mitake.constant;

public enum QmiUrl {
    POST_TIMELINE_EVENT(HttpMethod.POST, "events"),
    GET_TIMELINE_EVENTS(HttpMethod.GET, "events");

    public static final String BASE_URL = "https://ap.qmi.emome.net/v2/open/%s";

    private HttpMethod method;
    private String url;

    QmiUrl(HttpMethod method, String url) {
        this.method = method;
        this.url = String.format(BASE_URL, url);
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }
}
