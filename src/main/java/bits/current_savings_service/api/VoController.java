package bits.current_savings_service.api;

import bits.current_savings_service.common.logger.CurrentSavingsServiceLogger;
import bits.current_savings_service.common.utils.AppUtils;
import bits.current_savings_service.common.utils.ResponseUtils;
import bits.current_savings_service.domain.common.ApiResponse;
import bits.current_savings_service.domain.entity.GroupInfo;
import bits.current_savings_service.domain.enums.ResponseMessage;
import bits.current_savings_service.domain.response.GroupInfoResponse;
import bits.current_savings_service.domain.response.PaginationResponse;
import bits.current_savings_service.service.IGroupInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppUtils.BASE_URL + "/vo")
public class VoController extends BaseResource{
    private final IGroupInfoService groupInfoService;

    @GetMapping("/group-info")
    public ApiResponse<PaginationResponse<GroupInfoResponse>> getAllGroupInfos(
            @RequestParam(required = false, defaultValue = "0") Integer pageNumber,
            @RequestParam(required = false, defaultValue = "10") Integer pageSize,
            @RequestParam(required = false, defaultValue = "id") String sortBy,
            @RequestParam(required = false, defaultValue = "desc") String sortOrder) {

        PaginationResponse<GroupInfoResponse> groupInfo = groupInfoService.getGroupInfo(pageNumber, pageSize, sortBy, sortOrder);

//        logger.error("Group Info: " + groupInfo.toString());
        return ResponseUtils.createResponseObject(getMessage(ResponseMessage.OPERATION_SUCCESSFUL), groupInfo);
    }


}
