package com.example.springbootdemo07.pojo;

public class TbBook {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_book.id
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_book.type
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_book.name
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_book.description
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    private String description;

    @Override
    public String toString() {
        return "TbBook{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_book.id
     *
     * @return the value of tb_book.id
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_book.id
     *
     * @param id the value for tb_book.id
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_book.type
     *
     * @return the value of tb_book.type
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_book.type
     *
     * @param type the value for tb_book.type
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_book.name
     *
     * @return the value of tb_book.name
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_book.name
     *
     * @param name the value for tb_book.name
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_book.description
     *
     * @return the value of tb_book.description
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_book.description
     *
     * @param description the value for tb_book.description
     *
     * @mbg.generated Sun Apr 30 20:07:59 CST 2023
     */
    public void setDescription(String description) {
        this.description = description;
    }
}