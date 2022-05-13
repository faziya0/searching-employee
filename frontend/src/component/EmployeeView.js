const EmployeeView = (props)=>{
    const {emp}=props;
    
    
    return (
       <div className="card p-1">
        <div className="d-flex">
          <div className="flex-fill m-auto pl-2">
              <h6 className="d-inline">
                {emp.fullName} {emp.department} {emp.structure} {emp.speciality} {emp.email}
              </h6>
          </div>
          </div>
          </div>
          
              )
    }
    export default EmployeeView;