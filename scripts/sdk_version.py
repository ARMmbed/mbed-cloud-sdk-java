#!/usr/bin/python
import sdk_common


# Block in charge of print sdk version
class SDKVersion(sdk_common.BuildStepUsingGradle):
    def __init__(self, logger=None):
        super(SDKVersion, self).__init__('SDK Version', logger)

    def execute(self):
        self.log_info(self.common_config.get_config().get_version())
        return True
