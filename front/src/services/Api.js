import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8080",
  withCredentials: false,
  header: {
    Accept: "application/json",
    "content-Type": "application/json",
  },
});
