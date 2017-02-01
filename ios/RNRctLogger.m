
#import "RNRctLogger.h"
#import <React/RCTLog.h>
#import <React/UIView+React.h>
#import <React/RCTUtils.h>
#import <React/RCTConvert.h>
#import <React/RCTUIManager.h>
#import <React/RCTBridge.h>

@implementation RNRctLogger

RCT_EXPORT_MODULE()

@synthesize bridge = _bridge;

- (dispatch_queue_t)methodQueue
{
    return self.bridge.uiManager.methodQueue;
}

RCT_EXPORT_METHOD(log:(nonnull NSString *)tag
                  withMessage:(nonnull NSString *)message)
{
    NSLog(@"%@ %@", tag, message);
}

@end
  
