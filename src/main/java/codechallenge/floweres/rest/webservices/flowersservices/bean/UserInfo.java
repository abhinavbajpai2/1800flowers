package codechallenge.floweres.rest.webservices.flowersservices.bean;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class UserInfo implements Serializable {
	 /**
     * 
     */
    private static final long serialVersionUID = -6919228843375609774L;
private Integer userId;
private Integer id;
private String title;
private String body;

@Override
public String toString() {
	return "UserInfo [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
}

public Integer getUserId() {
return userId;
}

public void setUserId(Integer userId) {
this.userId = userId;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getBody() {
return body;
}

public void setBody(String body) {
this.body = body;
}

}

