public class NewsItem {

    /** Title of the news item */
    private String mTitle;

    /** Section name of the news item */
    private String mSectionName;

    /** Date of the news item */
    private String mDate;

    /** Url of the news item */
    private String mUrl;

    /**
     * Constructs a new {@link NewsItem} object.
     *
     * @param title is the title of the news item
     * @param sectionName is the section name of the news item
     * @param date is the date of the news item
     * @param url is the url of the news item
     */
    public NewsItem(String title, String sectionName, String date, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the title of the news item.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section name of the news item.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the date of the news item.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the url of the news item.
     */
    public String getLink() {
        return mUrl;
    }
}
