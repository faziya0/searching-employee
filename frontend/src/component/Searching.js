import { useState,useEffect } from "react";
import { getEmployee } from "../api/ApiCalls";
import ErrorPage from "./ErrorPage";
import EmployeeView from "./EmployeeView";
const Searching = ()=>{
    const [employee,setEmployee] = useState(
      { content: []}
    );
   const[input,setInput]=useState();
   const[error,setError]=useState();
   const[errorMode,setErrorMode]=useState(false);
   useEffect(()=>{
   loadEmployees();
   },[input])
   const loadEmployees = async () =>{
      
    try{
        setErrorMode(false)
    setEmployee(previous=> ({
            content: []
          }));

    const response = await getEmployee(input);

    setEmployee(previous => ({
        content: [ ...response.data]
      }));

}
     catch(Error){
         if(Error.response.data.message){
            setError(Error.response.data.message)
            setErrorMode(true)
         }
      
      
     }
     
 }
const{content}=employee
 
    return (

        <div className="container">
            <div>
      <br/>
    <h4>Employee searching bar</h4>
    <br/>
    <input  className="form-control" id="exampleInputPassword1" placeholder="Search employee by number, fullname etc..."
    onChange={(event)=>{setInput(event.target.value)}}
    {...console.log(input)}
    />
    
  
  <br/>
  <button type="submit" className="btn btn-outline-primary" onClick={loadEmployees}  >Search</button>
</div>
    <br/>    
    
      {errorMode ? <ErrorPage error={error}/> :  content.map(emp => {
        return <EmployeeView key={emp.id} emp={emp} />;
      })}

     
     
 
        </div>
     

    )
}
export default Searching;