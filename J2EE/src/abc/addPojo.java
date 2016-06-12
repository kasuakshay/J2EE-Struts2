package abc;

import java.sql.Date;

public class addPojo {

	public String id, movie_name, cd, director_name;
	public Date date;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	@Override
	public String toString() {
		return "addPojo [id=" + id + ", movie_name=" + movie_name + ", cd=" + cd + ", director_name=" + director_name
				+ ", date=" + date + "]";
	}



}
