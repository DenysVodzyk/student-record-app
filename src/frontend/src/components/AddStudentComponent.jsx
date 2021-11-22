import React from 'react';

const AddStudentComponent = () => {

    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [email, setEmail] = useState('');


    return (
        <div>
           <div className="container">
               <div className="row">
                   <div className="card col-md-6 offset-md-3 offset-md-3">
                       <h2 className="text-center"> Add Student </h2>
                       <div className="card-body">
                           
                       </div>

                   </div>

               </div>

           </div>
        </div>
    )
}

export default AddStudentComponent;