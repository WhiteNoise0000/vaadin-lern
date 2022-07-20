package mybatis.mapper;

import java.util.List;
import mybatis.model.Staff;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface StaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.staff
     *
     * @mbg.generated
     */
    @Delete({
        "delete from public.staff",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.staff
     *
     * @mbg.generated
     */
    @Insert({
        "insert into public.staff (staff_id, first_name, ",
        "last_name, address_id, ",
        "email, store_id, ",
        "active, username, password, ",
        "last_update, picture)",
        "values (#{staffId,jdbcType=INTEGER}, #{firstName,jdbcType=VARCHAR}, ",
        "#{lastName,jdbcType=VARCHAR}, #{addressId,jdbcType=SMALLINT}, ",
        "#{email,jdbcType=VARCHAR}, #{storeId,jdbcType=SMALLINT}, ",
        "#{active,jdbcType=BIT}, #{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{lastUpdate,jdbcType=TIMESTAMP}, #{picture,jdbcType=BINARY})"
    })
    int insert(Staff row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.staff
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "staff_id, first_name, last_name, address_id, email, store_id, active, username, ",
        "password, last_update, picture",
        "from public.staff",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.SMALLINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.SMALLINT),
        @Result(column="active", property="active", jdbcType=JdbcType.BIT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="picture", property="picture", jdbcType=JdbcType.BINARY)
    })
    Staff selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.staff
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "staff_id, first_name, last_name, address_id, email, store_id, active, username, ",
        "password, last_update, picture",
        "from public.staff"
    })
    @Results({
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.SMALLINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.SMALLINT),
        @Result(column="active", property="active", jdbcType=JdbcType.BIT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="picture", property="picture", jdbcType=JdbcType.BINARY)
    })
    List<Staff> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.staff
     *
     * @mbg.generated
     */
    @Update({
        "update public.staff",
        "set first_name = #{firstName,jdbcType=VARCHAR},",
          "last_name = #{lastName,jdbcType=VARCHAR},",
          "address_id = #{addressId,jdbcType=SMALLINT},",
          "email = #{email,jdbcType=VARCHAR},",
          "store_id = #{storeId,jdbcType=SMALLINT},",
          "active = #{active,jdbcType=BIT},",
          "username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "last_update = #{lastUpdate,jdbcType=TIMESTAMP},",
          "picture = #{picture,jdbcType=BINARY}",
        "where staff_id = #{staffId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Staff row);
}