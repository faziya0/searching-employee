import axios from "axios"

export const getEmployee=(search)=>{
return axios.get('/api/employee?search='+search)
}