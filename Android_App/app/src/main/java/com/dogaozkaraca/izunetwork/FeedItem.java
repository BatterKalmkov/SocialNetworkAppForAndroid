package com.dogaozkaraca.izunetwork;

import java.util.Date;

/**
 * IZU Network
 * Created by doga on 23/04/16.
 */
public class FeedItem {
    int postID;
    String name;
    String lastName;
    String profileImageURL;
    String content;
    Date postTime;
    String[] imageURLs;
    int likeCount;
    int dislikeCount;
    int commentCount;

    public FeedItem(int fpostID, String fname, String flastName, String fprofileImageURL,
                    String fcontent, Date fpostTime, String[] fimageURLs,
                    int flikeCount, int fdislikeCount, int fcommentCount)
    {
        postID = fpostID;
        name = fname;
        lastName = flastName;
        profileImageURL = fprofileImageURL;
        content = fcontent;
        postTime = fpostTime;
        imageURLs = fimageURLs;
        likeCount = flikeCount;
        dislikeCount = fdislikeCount;
        commentCount = fcommentCount;
    }

    public int getPostID()
    {
        return postID;
    }
    public String getName()
    {
        return name;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getContent()
    {
        return content;
    }

    public String getPostedTime() {
        return "3 saat önce.";
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }
}
