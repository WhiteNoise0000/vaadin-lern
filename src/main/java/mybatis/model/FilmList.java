package mybatis.model;

import java.math.BigDecimal;

public class FilmList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.fid
     *
     * @mbg.generated
     */
    private Integer fid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.category
     *
     * @mbg.generated
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.length
     *
     * @mbg.generated
     */
    private Short length;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.rating
     *
     * @mbg.generated
     */
    private String rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film_list.actors
     *
     * @mbg.generated
     */
    private String actors;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.fid
     *
     * @return the value of public.film_list.fid
     *
     * @mbg.generated
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.fid
     *
     * @param fid the value for public.film_list.fid
     *
     * @mbg.generated
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.title
     *
     * @return the value of public.film_list.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.title
     *
     * @param title the value for public.film_list.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.description
     *
     * @return the value of public.film_list.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.description
     *
     * @param description the value for public.film_list.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.category
     *
     * @return the value of public.film_list.category
     *
     * @mbg.generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.category
     *
     * @param category the value for public.film_list.category
     *
     * @mbg.generated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.price
     *
     * @return the value of public.film_list.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.price
     *
     * @param price the value for public.film_list.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.length
     *
     * @return the value of public.film_list.length
     *
     * @mbg.generated
     */
    public Short getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.length
     *
     * @param length the value for public.film_list.length
     *
     * @mbg.generated
     */
    public void setLength(Short length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.rating
     *
     * @return the value of public.film_list.rating
     *
     * @mbg.generated
     */
    public String getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.rating
     *
     * @param rating the value for public.film_list.rating
     *
     * @mbg.generated
     */
    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film_list.actors
     *
     * @return the value of public.film_list.actors
     *
     * @mbg.generated
     */
    public String getActors() {
        return actors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film_list.actors
     *
     * @param actors the value for public.film_list.actors
     *
     * @mbg.generated
     */
    public void setActors(String actors) {
        this.actors = actors == null ? null : actors.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.film_list
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FilmList other = (FilmList) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getActors() == null ? other.getActors() == null : this.getActors().equals(other.getActors()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.film_list
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getActors() == null) ? 0 : getActors().hashCode());
        return result;
    }
}