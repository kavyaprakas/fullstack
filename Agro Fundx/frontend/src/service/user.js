import instance  from "./axios";
const api_url="http://localhost:8181";
const userList=()=>instance.get(`${api_url}/api/v1/`)