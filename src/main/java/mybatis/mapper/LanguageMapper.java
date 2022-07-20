package mybatis.mapper;

import java.util.List;
import mybatis.model.Language;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface LanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.language
     *
     * @mbg.generated
     */
    @Delete({
        "delete from public.language",
        "where language_id = #{languageId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer languageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.language
     *
     * @mbg.generated
     */
    @Insert({
        "insert into public.language (language_id, name, ",
        "last_update)",
        "values (#{languageId,jdbcType=INTEGER}, #{name,jdbcType=CHAR}, ",
        "#{lastUpdate,jdbcType=TIMESTAMP})"
    })
    int insert(Language row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.language
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "language_id, name, last_update",
        "from public.language",
        "where language_id = #{languageId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="language_id", property="languageId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP)
    })
    Language selectByPrimaryKey(Integer languageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.language
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "language_id, name, last_update",
        "from public.language"
    })
    @Results({
        @Result(column="language_id", property="languageId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="last_update", property="lastUpdate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Language> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.language
     *
     * @mbg.generated
     */
    @Update({
        "update public.language",
        "set name = #{name,jdbcType=CHAR},",
          "last_update = #{lastUpdate,jdbcType=TIMESTAMP}",
        "where language_id = #{languageId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Language row);
}