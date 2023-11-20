package com.iracanyes.fintech.jeny.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is the Account model
 */

@Schema(name = "Account", description = "This is the Account model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Account implements Serializable {

  private static final long serialVersionUID = 1L;

  private JsonNullable<Object> id = JsonNullable.undefined();

  private String firstname;

  private String lastname;

  private String city;

  public Account id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * The ID of Account
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public Account firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * The full name of the User
   * @return firstname
  */
  
  @Schema(name = "firstname", description = "The full name of the User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public Account lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * The full name of the User
   * @return lastname
  */
  
  @Schema(name = "lastname", description = "The full name of the User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Account city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The City of the Account
   * @return city
  */
  
  @Schema(name = "city", description = "The City of the Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return equalsNullable(this.id, account.id) &&
        Objects.equals(this.firstname, account.firstname) &&
        Objects.equals(this.lastname, account.lastname) &&
        Objects.equals(this.city, account.city);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), firstname, lastname, city);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

