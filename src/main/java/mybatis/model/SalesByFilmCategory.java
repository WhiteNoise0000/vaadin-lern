package mybatis.model;

public class SalesByFilmCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.sales_by_film_category.category
     *
     * @mbg.generated
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    private Short totalSales;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.sales_by_film_category.category
     *
     * @return the value of public.sales_by_film_category.category
     *
     * @mbg.generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.sales_by_film_category.category
     *
     * @param category the value for public.sales_by_film_category.category
     *
     * @mbg.generated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.sales_by_film_category.total_sales
     *
     * @return the value of public.sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    public Short getTotalSales() {
        return totalSales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.sales_by_film_category.total_sales
     *
     * @param totalSales the value for public.sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    public void setTotalSales(Short totalSales) {
        this.totalSales = totalSales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.sales_by_film_category
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
        SalesByFilmCategory other = (SalesByFilmCategory) that;
        return (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getTotalSales() == null ? other.getTotalSales() == null : this.getTotalSales().equals(other.getTotalSales()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.sales_by_film_category
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getTotalSales() == null) ? 0 : getTotalSales().hashCode());
        return result;
    }
}