package mybatis.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Film {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.film_id
     *
     * @mbg.generated
     */
    private Integer filmId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.release_year
     *
     * @mbg.generated
     */
    private Object releaseYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.language_id
     *
     * @mbg.generated
     */
    private Short languageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.rental_duration
     *
     * @mbg.generated
     */
    private Short rentalDuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.rental_rate
     *
     * @mbg.generated
     */
    private BigDecimal rentalRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.length
     *
     * @mbg.generated
     */
    private Short length;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.replacement_cost
     *
     * @mbg.generated
     */
    private BigDecimal replacementCost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.rating
     *
     * @mbg.generated
     */
    private String rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.last_update
     *
     * @mbg.generated
     */
    private LocalDateTime lastUpdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.special_features
     *
     * @mbg.generated
     */
    private Object specialFeatures;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.film.fulltext
     *
     * @mbg.generated
     */
    private Object fulltext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.film_id
     *
     * @return the value of public.film.film_id
     *
     * @mbg.generated
     */
    public Integer getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.film_id
     *
     * @param filmId the value for public.film.film_id
     *
     * @mbg.generated
     */
    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.title
     *
     * @return the value of public.film.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.title
     *
     * @param title the value for public.film.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.description
     *
     * @return the value of public.film.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.description
     *
     * @param description the value for public.film.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.release_year
     *
     * @return the value of public.film.release_year
     *
     * @mbg.generated
     */
    public Object getReleaseYear() {
        return releaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.release_year
     *
     * @param releaseYear the value for public.film.release_year
     *
     * @mbg.generated
     */
    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.language_id
     *
     * @return the value of public.film.language_id
     *
     * @mbg.generated
     */
    public Short getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.language_id
     *
     * @param languageId the value for public.film.language_id
     *
     * @mbg.generated
     */
    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.rental_duration
     *
     * @return the value of public.film.rental_duration
     *
     * @mbg.generated
     */
    public Short getRentalDuration() {
        return rentalDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.rental_duration
     *
     * @param rentalDuration the value for public.film.rental_duration
     *
     * @mbg.generated
     */
    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.rental_rate
     *
     * @return the value of public.film.rental_rate
     *
     * @mbg.generated
     */
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.rental_rate
     *
     * @param rentalRate the value for public.film.rental_rate
     *
     * @mbg.generated
     */
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.length
     *
     * @return the value of public.film.length
     *
     * @mbg.generated
     */
    public Short getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.length
     *
     * @param length the value for public.film.length
     *
     * @mbg.generated
     */
    public void setLength(Short length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.replacement_cost
     *
     * @return the value of public.film.replacement_cost
     *
     * @mbg.generated
     */
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.replacement_cost
     *
     * @param replacementCost the value for public.film.replacement_cost
     *
     * @mbg.generated
     */
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.rating
     *
     * @return the value of public.film.rating
     *
     * @mbg.generated
     */
    public String getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.rating
     *
     * @param rating the value for public.film.rating
     *
     * @mbg.generated
     */
    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.last_update
     *
     * @return the value of public.film.last_update
     *
     * @mbg.generated
     */
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.last_update
     *
     * @param lastUpdate the value for public.film.last_update
     *
     * @mbg.generated
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.special_features
     *
     * @return the value of public.film.special_features
     *
     * @mbg.generated
     */
    public Object getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.special_features
     *
     * @param specialFeatures the value for public.film.special_features
     *
     * @mbg.generated
     */
    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.film.fulltext
     *
     * @return the value of public.film.fulltext
     *
     * @mbg.generated
     */
    public Object getFulltext() {
        return fulltext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.film.fulltext
     *
     * @param fulltext the value for public.film.fulltext
     *
     * @mbg.generated
     */
    public void setFulltext(Object fulltext) {
        this.fulltext = fulltext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.film
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
        Film other = (Film) that;
        return (this.getFilmId() == null ? other.getFilmId() == null : this.getFilmId().equals(other.getFilmId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getReleaseYear() == null ? other.getReleaseYear() == null : this.getReleaseYear().equals(other.getReleaseYear()))
            && (this.getLanguageId() == null ? other.getLanguageId() == null : this.getLanguageId().equals(other.getLanguageId()))
            && (this.getRentalDuration() == null ? other.getRentalDuration() == null : this.getRentalDuration().equals(other.getRentalDuration()))
            && (this.getRentalRate() == null ? other.getRentalRate() == null : this.getRentalRate().equals(other.getRentalRate()))
            && (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
            && (this.getReplacementCost() == null ? other.getReplacementCost() == null : this.getReplacementCost().equals(other.getReplacementCost()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getSpecialFeatures() == null ? other.getSpecialFeatures() == null : this.getSpecialFeatures().equals(other.getSpecialFeatures()))
            && (this.getFulltext() == null ? other.getFulltext() == null : this.getFulltext().equals(other.getFulltext()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.film
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFilmId() == null) ? 0 : getFilmId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getReleaseYear() == null) ? 0 : getReleaseYear().hashCode());
        result = prime * result + ((getLanguageId() == null) ? 0 : getLanguageId().hashCode());
        result = prime * result + ((getRentalDuration() == null) ? 0 : getRentalDuration().hashCode());
        result = prime * result + ((getRentalRate() == null) ? 0 : getRentalRate().hashCode());
        result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
        result = prime * result + ((getReplacementCost() == null) ? 0 : getReplacementCost().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getSpecialFeatures() == null) ? 0 : getSpecialFeatures().hashCode());
        result = prime * result + ((getFulltext() == null) ? 0 : getFulltext().hashCode());
        return result;
    }
}