package com.example.kamerton.resolver;

import java.util.List;
import com.example.kamerton.entity.UserRequest;
import com.example.kamerton.repository.UserRequestRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;


// Component api request
@DgsComponent
public class UserRequestResolver {

    // create private repository
    private final UserRequestRepository userRequestRepository;

    // set
    public UserRequestResolver(UserRequestRepository userRequestRepository) {
        this.userRequestRepository = userRequestRepository;
    }

    // graphQl mutation
    @DgsMutation
    public UserRequest createUserRequest(
        @InputArgument String userName,  // @InputArgument for correct use variables
        @InputArgument String phoneNumber, 
        @InputArgument String email, 
        @InputArgument String requestMessage
    ) {
        UserRequest request = new UserRequest();
        request.setUserName(userName);
        request.setPhoneNumber(phoneNumber);
        request.setEmail(email);
        request.setRequestMessage(requestMessage);

        return userRequestRepository.save(request);
    }  

    // Return all requests
    @DgsQuery
    public List<UserRequest> allUserRequests() {
        return userRequestRepository.findAll();
    }

}
