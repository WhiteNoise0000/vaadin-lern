package mybatis.model;

import java.time.LocalDateTime;

public class Country {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.country.country_id
     *
     * @mbg.generated
     */
    private Integer countryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.country.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.country.last_update
     *
     * @mbg.generated
     */
    private LocalDateTime lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.country.country_id
     *
     * @return the value of public.country.country_id
     *
     * @mbg.generated
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.country.country_id
     *
     * @param countryId the value for public.country.country_id
     *
     * @mbg.generated
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.country.country
     *
     * @return the value of public.country.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.country.country
     *
     * @param country the value for public.country.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.country.last_update
     *
     * @return the value of public.country.last_update
     *
     * @mbg.generated
     */
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.country.last_update
     *
     * @param lastUpdate the value for public.country.last_update
     *
     * @mbg.generated
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.country
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
        Country other = (Country) that;
        return (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.country
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        return result;
    }
}